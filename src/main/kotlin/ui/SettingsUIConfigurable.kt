package ui

import com.intellij.openapi.options.BoundConfigurable
import com.intellij.openapi.ui.DialogPanel

/**
 * This application level configurable shows up the in IDE Preferences UI.
 */
class SettingsUIConfigurable : BoundConfigurable("ELKAutoComplete - Better Logs, Better Life") {
    override fun apply() {
        super.apply()
    }

    override fun cancel() {
        super.cancel()
    }

    /** When the form is changed by the user, this returns `true` and enables the "Apply" button. */
    override fun isModified(): Boolean {
        return super.isModified()
    }

    override fun reset() {
        super.reset()
    }

    override fun createPanel(): DialogPanel = createDialogPanel()
}