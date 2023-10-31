package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LabelsTest {

    @Test
    @Feature("Issue в репозитории")
    @Story("Создание Issue")
    @Owner("maxaten")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "Testing", url = "https://testing.github.com")
    @DisplayName("Создание issue для авторизованного пользователя")
    public void testStaticLabels() {
    }

    @Test
    public void testDynamicLabels() {
        Allure.getLifecycle().updateTestCase(
                t -> t.setName("Создание issue для авторизованного пользователя")
        );
        Allure.feature("Issue в репозитории");
        Allure.story("Создание Issue");
        Allure.label("owner", "maxaten");
        Allure.label("Severity", SeverityLevel.CRITICAL.value());
        Allure.link("Testing", "https://testing.github.com");
        Allure.label("Display Name", "Создание issue для авторизованного пользователя");
    }
}
