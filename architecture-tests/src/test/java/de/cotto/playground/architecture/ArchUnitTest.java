package de.cotto.playground.architecture;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.dependencies.SliceRule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;
import static com.tngtech.archunit.library.dependencies.SlicesRuleDefinition.slices;

public class ArchUnitTest {

    private JavaClasses importedClasses;

    @BeforeEach
    void setUp() {
        importedClasses = new ClassFileImporter().importPackages("de.cotto");
    }

    @Test
    void dtos_must_not_depend_on_services() {
        ArchRule rule = noClasses().that()
                .haveSimpleNameEndingWith("Dto").or().haveSimpleNameEndingWith("DTO")
                .should()
                .dependOnClassesThat().haveSimpleNameEndingWith("Service");
        rule.check(importedClasses);
    }

    @Test
    void no_package_cycle() {
        SliceRule rule = slices().matching("de.cotto.(**)").should().beFreeOfCycles();
        rule.check(importedClasses);
    }
}
