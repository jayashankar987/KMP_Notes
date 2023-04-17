import com.jaya.notes.App
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        BrowserViewportWindow("Notes") {
            App()
        }
    }
}
