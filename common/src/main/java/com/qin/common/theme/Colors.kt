package com.qin.common.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

val Cyan500 = Color(0xff01BBD4)
val Cyan700 = Color(0xFF0097A7)
val BabyBlue500 = Color(0xFF03A9F4)
val BabyBlue700 = Color(0xFF0288D1)

val Black700 = Color(0xFF434343)
val Black900 = Color(0xFF262626)
val Gray700 = Color(0xFF616161)
val Gray900 = Color(0xFF212121)

val Shadow11 = Color(0xff001787)
val Shadow10 = Color(0xff00119e)
val Shadow9 = Color(0xff0009b3)
val Shadow8 = Color(0xff0200c7)
val Shadow7 = Color(0xff0e00d7)
val Shadow6 = Color(0xff2a13e4)
val Shadow5 = Color(0xff4b30ed)
val Shadow4 = Color(0xff7057f5)
val Shadow3 = Color(0xff9b86fa)
val Shadow2 = Color(0xffc8bbfd)
val Shadow1 = Color(0xffded6fe)
val Shadow0 = Color(0xfff4f2ff)

val Ocean11 = Color(0xff005687)
val Ocean10 = Color(0xff006d9e)
val Ocean9 = Color(0xff0087b3)
val Ocean8 = Color(0xff00a1c7)
val Ocean7 = Color(0xff00b9d7)
val Ocean6 = Color(0xff13d0e4)
val Ocean5 = Color(0xff30e2ed)
val Ocean4 = Color(0xff57eff5)
val Ocean3 = Color(0xff86f7fa)
val Ocean2 = Color(0xffbbfdfd)
val Ocean1 = Color(0xffd6fefe)
val Ocean0 = Color(0xfff2ffff)

val Lavender11 = Color(0xff170085)
val Lavender10 = Color(0xff23009e)
val Lavender9 = Color(0xff3300b3)
val Lavender8 = Color(0xff4400c7)
val Lavender7 = Color(0xff5500d7)
val Lavender6 = Color(0xff6f13e4)
val Lavender5 = Color(0xff8a30ed)
val Lavender4 = Color(0xffa557f5)
val Lavender3 = Color(0xffc186fa)
val Lavender2 = Color(0xffdebbfd)
val Lavender1 = Color(0xffebd6fe)
val Lavender0 = Color(0xfff9f2ff)

val Rose11 = Color(0xff7f0054)
val Rose10 = Color(0xff97005c)
val Rose9 = Color(0xffaf0060)
val Rose8 = Color(0xffc30060)
val Rose7 = Color(0xffd4005d)
val Rose6 = Color(0xffe21365)
val Rose5 = Color(0xffec3074)
val Rose4 = Color(0xfff4568b)
val Rose3 = Color(0xfff985aa)
val Rose2 = Color(0xfffdbbcf)
val Rose1 = Color(0xfffed6e2)
val Rose0 = Color(0xfffff2f6)

val Neutral8 = Color(0xff121212)
val Neutral7 = Color(0xdef000000)
val Neutral6 = Color(0x99000000)
val Neutral5 = Color(0x61000000)
val Neutral4 = Color(0x1f000000)
val Neutral3 = Color(0x1fffffff)
val Neutral2 = Color(0x61ffffff)
val Neutral1 = Color(0xbdffffff)
val Neutral0 = Color(0xffffffff)

val FunctionalRed = Color(0xffd00036)
val FunctionalRedDark = Color(0xffea6d7e)
val FunctionalGreen = Color(0xff52c41a)
val FunctionalGrey = Color(0xfff6f6f6)
val FunctionalDarkGrey = Color(0xff2e2e2e)

val Cyan_00D8C9 = Color(0xff00D8C9)
val Gray_8E8E93 = Color(0xff8E8E93)

val LightColorPalette = MyColors(
    brand = Lavender2,
    uiBackground = Neutral0,
    uiBorder = Neutral4,
    uiFloated = FunctionalGrey,
    textSecondary = Neutral7,
    textHelp = Neutral6,
    textInteractive = Neutral0,
    textLink = Ocean11,
    iconSecondary = Neutral7,
    iconInteractive = Neutral0,
    iconInteractiveInactive = Neutral1,
    error = FunctionalRed,
    gradient6_1 = listOf(Shadow4, Ocean3, Shadow2, Ocean3, Shadow4),
    gradient6_2 = listOf(Rose4, Lavender3, Rose2, Lavender3, Rose4),
    gradient3_1 = listOf(Shadow2, Ocean3, Shadow4),
    gradient3_2 = listOf(Rose2, Lavender3, Rose4),
    gradient2_1 = listOf(Shadow4, Shadow11),
    gradient2_2 = listOf(Ocean3, Shadow3),
    isDark = false
)

val DarkColorPalette = MyColors(
    brand = Shadow1,
    uiBackground = Neutral8,
    uiBorder = Neutral3,
    uiFloated = FunctionalDarkGrey,
    textPrimary = Shadow1,
    textSecondary = Neutral0,
    textHelp = Neutral1,
    textInteractive = Neutral7,
    textLink = Ocean2,
    iconPrimary = Shadow1,
    iconSecondary = Neutral0,
    iconInteractive = Neutral7,
    iconInteractiveInactive = Neutral6,
    error = FunctionalRedDark,
    gradient6_1 = listOf(Shadow5, Ocean7, Shadow9, Ocean7, Shadow5),
    gradient6_2 = listOf(Rose11, Lavender7, Rose8, Lavender7, Rose11),
    gradient3_1 = listOf(Shadow9, Ocean7, Shadow5),
    gradient3_2 = listOf(Rose8, Lavender7, Rose11),
    gradient2_1 = listOf(Ocean3, Shadow3),
    gradient2_2 = listOf(Ocean7, Shadow7),
    isDark = true
)

fun defaultColors(darkTheme: Boolean, defaultColor: Color = Color.Transparent) = Colors(
    primary = defaultColor,
    primaryVariant = defaultColor,
    secondary = defaultColor,
    secondaryVariant = defaultColor,
    background = defaultColor,
    surface = defaultColor,
    error = defaultColor,
    onPrimary = defaultColor,
    onSecondary = defaultColor,
    onBackground = defaultColor,
    onSurface = defaultColor,
    onError = defaultColor,
    isLight = !darkTheme
)

@Stable
class MyColors(
    gradient6_1: List<Color>,
    gradient6_2: List<Color>,
    gradient3_1: List<Color>,
    gradient3_2: List<Color>,
    gradient2_1: List<Color>,
    gradient2_2: List<Color>,
    brand: Color,
    uiBackground: Color,
    uiBorder: Color,
    uiFloated: Color,
    interactivePrimary: List<Color> = gradient2_1,
    interactiveSecondary: List<Color> = gradient2_2,
    interactiveMask: List<Color> = gradient6_1,
    textPrimary: Color = brand,
    textSecondary: Color,
    textHelp: Color,
    textInteractive: Color,
    textLink: Color,
    iconPrimary: Color = brand,
    iconSecondary: Color,
    iconInteractive: Color,
    iconInteractiveInactive: Color,
    error: Color,
    notificationBadge: Color = error,
    isDark: Boolean
) {
    var gradient6_1 by mutableStateOf(gradient6_1, structuralEqualityPolicy())
        internal set
    var gradient6_2 by mutableStateOf(gradient6_2, structuralEqualityPolicy())
        internal set
    var gradient3_1 by mutableStateOf(gradient3_1, structuralEqualityPolicy())
        internal set
    var gradient3_2 by mutableStateOf(gradient3_2, structuralEqualityPolicy())
        internal set
    var gradient2_1 by mutableStateOf(gradient2_1, structuralEqualityPolicy())
        internal set
    var gradient2_2 by mutableStateOf(gradient2_2, structuralEqualityPolicy())
        internal set
    var brand by mutableStateOf(brand, structuralEqualityPolicy())
        internal set
    var uiBackground by mutableStateOf(uiBackground, structuralEqualityPolicy())
        internal set
    var uiBorder by mutableStateOf(uiBorder, structuralEqualityPolicy())
        internal set
    var uiFloated by mutableStateOf(uiFloated, structuralEqualityPolicy())
        internal set
    var interactivePrimary by mutableStateOf(interactivePrimary, structuralEqualityPolicy())
        internal set
    var interactiveSecondary by mutableStateOf(interactiveSecondary, structuralEqualityPolicy())
        internal set
    var interactiveMask by mutableStateOf(interactiveMask, structuralEqualityPolicy())
        internal set
    var textPrimary by mutableStateOf(textPrimary, structuralEqualityPolicy())
        internal set
    var textSecondary by mutableStateOf(textSecondary, structuralEqualityPolicy())
        internal set
    var textHelp by mutableStateOf(textHelp, structuralEqualityPolicy())
        internal set
    var textInteractive by mutableStateOf(textInteractive, structuralEqualityPolicy())
        internal set
    var textLink by mutableStateOf(textLink, structuralEqualityPolicy())
        internal set
    var iconPrimary by mutableStateOf(iconPrimary, structuralEqualityPolicy())
        internal set
    var iconSecondary by mutableStateOf(iconSecondary, structuralEqualityPolicy())
        internal set
    var iconInteractive by mutableStateOf(iconInteractive, structuralEqualityPolicy())
        internal set
    var iconInteractiveInactive by mutableStateOf(
        iconInteractiveInactive,
        structuralEqualityPolicy()
    )
        internal set
    var error by mutableStateOf(error, structuralEqualityPolicy())
        internal set
    var notificationBadge by mutableStateOf(notificationBadge, structuralEqualityPolicy())
        internal set
    var isDark by mutableStateOf(isDark, structuralEqualityPolicy())
        internal set

    fun copy(
        gradient6_1: List<Color> = this.gradient6_1,
        gradient6_2: List<Color> = this.gradient6_2,
        gradient3_1: List<Color> = this.gradient3_1,
        gradient3_2: List<Color> = this.gradient3_2,
        gradient2_1: List<Color> = this.gradient2_1,
        gradient2_2: List<Color> = this.gradient2_2,
        brand: Color = this.brand,
        uiBackground: Color = this.uiBackground,
        uiBorder: Color = this.uiBorder,
        uiFloated: Color = this.uiFloated,
        interactivePrimary: List<Color> = this.interactivePrimary,
        interactiveSecondary: List<Color> = this.interactiveSecondary,
        interactiveMask: List<Color> = this.interactiveMask,
        textPrimary: Color = this.textPrimary,
        textSecondary: Color = this.textSecondary,
        textHelp: Color = this.textHelp,
        textInteractive: Color = this.textInteractive,
        textLink: Color = this.textLink,
        iconPrimary: Color = this.iconPrimary,
        iconSecondary: Color = this.iconSecondary,
        iconInteractive: Color = this.iconInteractive,
        iconInteractiveInactive: Color = this.iconInteractiveInactive,
        error: Color = this.error,
        notificationBadge: Color = this.notificationBadge,
        isDark: Boolean = this.isDark
    ): MyColors = MyColors(
        gradient6_1,
        gradient6_2,
        gradient3_1,
        gradient3_2,
        gradient2_1,
        gradient2_2,
        brand,
        uiBackground,
        uiBorder,
        uiFloated,
        interactivePrimary,
        interactiveSecondary,
        interactiveMask,
        textPrimary,
        textSecondary,
        textHelp,
        textInteractive,
        textLink,
        iconPrimary,
        iconSecondary,
        iconInteractive,
        iconInteractiveInactive,
        error,
        notificationBadge,
        isDark
    )
}

fun MyColors.update(other: MyColors) {
    gradient6_1 = other.gradient6_1
    gradient6_2 = other.gradient6_2
    gradient3_1 = other.gradient3_1
    gradient3_2 = other.gradient3_2
    gradient2_1 = other.gradient2_1
    gradient2_2 = other.gradient2_2
    brand = other.brand
    uiBackground = other.uiBackground
    uiBorder = other.uiBorder
    uiFloated = other.uiFloated
    interactivePrimary = other.interactivePrimary
    interactiveSecondary = other.interactiveSecondary
    interactiveMask = other.interactiveMask
    textPrimary = other.textPrimary
    textSecondary = other.textSecondary
    textHelp = other.textHelp
    textInteractive = other.textInteractive
    textLink = other.textLink
    iconPrimary = other.iconPrimary
    iconSecondary = other.iconSecondary
    iconInteractive = other.iconInteractive
    iconInteractiveInactive = other.iconInteractiveInactive
    error = other.error
    notificationBadge = other.notificationBadge
    isDark = other.isDark
}

