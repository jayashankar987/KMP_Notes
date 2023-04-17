import androidx.compose.ui.window.ComposeUIViewController
import com.jaya.notes.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController {
    return ComposeUIViewController { App() }
}
