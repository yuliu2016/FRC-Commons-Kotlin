package ca.warp7.frc.path

@Suppress("unused", "MemberVisibilityCanBePrivate", "CanBeParameter")
data class QuinticSegment2D(
        val x0: Double,
        val x1: Double,
        val dx0: Double,
        val dx1: Double,
        val ddx0: Double,
        val ddx1: Double,
        val y0: Double,
        val y1: Double,
        val dy0: Double,
        val dy1: Double,
        val ddy0: Double,
        val ddy1: Double
) : Path2D {

    val x = QuinticSpline(x0, dx0, ddx0, x1, dx1, ddx1)
    val y = QuinticSpline(y0, dy0, ddy0, y1, dy1, ddy1)

    override fun px(t: Double) = x.p(t)
    override fun py(t: Double) = y.p(t)
    override fun vx(t: Double) = x.v(t)
    override fun vy(t: Double) = y.v(t)
    override fun ax(t: Double) = x.a(t)
    override fun ay(t: Double) = y.a(t)
    override fun jx(t: Double) = x.j(t)
    override fun jy(t: Double) = y.j(t)
}