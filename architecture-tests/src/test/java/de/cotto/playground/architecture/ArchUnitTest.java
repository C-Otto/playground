package de.cotto.playground.architecture;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.library.dependencies.SlicesRuleDefinition.slices;
import static org.assertj.core.api.Assertions.assertThat;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.elements.ClassesShouldConjunction;
import com.tngtech.archunit.library.dependencies.SliceRule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArchUnitTest {

    private JavaClasses importedClasses;

    @BeforeEach
    void setUp() {
        importedClasses = new ClassFileImporter().importPackages("de.cotto");
    }

    @Test
    void services_must_not_access_dto_classes_directly() {
        ArchRule rule = classes().that()
                .haveSimpleNameEndingWith("Dto").or().haveSimpleNameEndingWith("DTO")
                .should()
                .onlyHaveDependentClassesThat().haveSimpleNameNotEndingWith("Service");
        rule.check(importedClasses);
    }

    @Test
    void services_must_not_access_spring_data_repositories_directly() {
        ArchRule rule = classes().that()
                .areAssignableTo("org.springframework.data.repository.Repository")
                .should()
                .onlyHaveDependentClassesThat().haveSimpleNameNotEndingWith("Service");
        rule.check(importedClasses);
    }

    @Test
    void no_package_cycle() {
        SliceRule rule = slices().matching("de.cotto.(**)").should().beFreeOfCycles();
        assertThat(importedClasses).isNotEmpty();
        rule.check(importedClasses);
    }
}
