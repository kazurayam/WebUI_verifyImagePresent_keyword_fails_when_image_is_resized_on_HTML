import java.nio.file.Path
import java.nio.file.Paths
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

Path projectDir = Paths.get(RunConfiguration.getProjectDir())

/**
 * Case where HTML displays the image in its original size
 */
Path html1 = projectDir.resolve("page_with_image_in_original_width.html")

WebUI.openBrowser(html1.toFile().toURI().toURL().toExternalForm())
WebUI.delay(3)
WebUI.verifyImagePresent(findTestObject("GoogleLogo"))   // this will pass

// close the page
WebUI.closeBrowser()
