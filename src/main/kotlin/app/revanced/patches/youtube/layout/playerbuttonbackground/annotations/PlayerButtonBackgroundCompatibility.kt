package app.revanced.patches.youtube.layout.playerbuttonbackground.annotations
import app.revanced.patcher.annotation.Compatibility
import app.revanced.patcher.annotation.Package

@Compatibility(
    [
        Package("com.google.android.youtube", arrayOf("17.45.36")
    ]
)
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
internal annotation class PlayerButtonBackgroundCompatibility
