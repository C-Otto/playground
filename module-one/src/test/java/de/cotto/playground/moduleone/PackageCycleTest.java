package de.cotto.playground.moduleone;

import static org.assertj.core.api.Assertions.assertThat;

import guru.nidi.codeassert.config.AnalyzerConfig;
import guru.nidi.codeassert.dependency.DependencyAnalyzer;
import guru.nidi.codeassert.dependency.DependencyMap;
import guru.nidi.codeassert.dependency.DependencyResult;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class PackageCycleTest {
    @Test
    void noPackageCycles() {
        assertThat(hasPackageCycles()).isFalse();
    }

    public static boolean hasPackageCycles() {
        return !getPackageCycles().isEmpty();
    }

    private static Set<DependencyMap> getPackageCycles() {
        AnalyzerConfig configuration = AnalyzerConfig.gradle().main();
        DependencyAnalyzer dependencyAnalyzer = new DependencyAnalyzer(configuration);
        DependencyResult dependencyResult = dependencyAnalyzer.analyze();
        return dependencyResult.findings().getCycles();
    }
}
