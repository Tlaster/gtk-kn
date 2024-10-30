// This is a generated file. Do not modify.
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.graphene.graphene_triangle_alloc
import org.gtkkn.native.graphene.graphene_triangle_contains_point
import org.gtkkn.native.graphene.graphene_triangle_equal
import org.gtkkn.native.graphene.graphene_triangle_free
import org.gtkkn.native.graphene.graphene_triangle_get_area
import org.gtkkn.native.graphene.graphene_triangle_get_barycoords
import org.gtkkn.native.graphene.graphene_triangle_get_bounding_box
import org.gtkkn.native.graphene.graphene_triangle_get_midpoint
import org.gtkkn.native.graphene.graphene_triangle_get_normal
import org.gtkkn.native.graphene.graphene_triangle_get_plane
import org.gtkkn.native.graphene.graphene_triangle_get_points
import org.gtkkn.native.graphene.graphene_triangle_get_uv
import org.gtkkn.native.graphene.graphene_triangle_get_vertices
import org.gtkkn.native.graphene.graphene_triangle_init_from_point3d
import org.gtkkn.native.graphene.graphene_triangle_init_from_vec3
import org.gtkkn.native.graphene.graphene_triangle_t
import kotlin.Boolean
import kotlin.Float
import kotlin.Unit

/**
 * A triangle.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `a`: Array parameter of type gfloat is not supported
 * - field `a`: Record field a is private
 * - field `b`: Record field b is private
 * - field `c`: Record field c is private
 *
 * @since 1.2
 */
public class Triangle(
    pointer: CPointer<graphene_triangle_t>,
) : Record {
    public val grapheneTrianglePointer: CPointer<graphene_triangle_t> = pointer

    /**
     * Checks whether the given triangle @t contains the point @p.
     *
     * @param p a #graphene_point3d_t
     * @return `true` if the point is inside the triangle
     * @since 1.2
     */
    public fun containsPoint(p: Point3D): Boolean =
        graphene_triangle_contains_point(grapheneTrianglePointer.reinterpret(), p.graphenePoint3DPointer)

    /**
     * Checks whether the two given #graphene_triangle_t are equal.
     *
     * @param b a #graphene_triangle_t
     * @return `true` if the triangles are equal
     * @since 1.2
     */
    public fun equal(b: Triangle): Boolean =
        graphene_triangle_equal(grapheneTrianglePointer.reinterpret(), b.grapheneTrianglePointer)

    /**
     * Frees the resources allocated by graphene_triangle_alloc().
     *
     * @since 1.2
     */
    public fun free(): Unit = graphene_triangle_free(grapheneTrianglePointer.reinterpret())

    /**
     * Computes the area of the given #graphene_triangle_t.
     *
     * @return the area of the triangle
     * @since 1.2
     */
    public fun getArea(): Float = graphene_triangle_get_area(grapheneTrianglePointer.reinterpret())

    /**
     * Computes the [barycentric coordinates](http://en.wikipedia.org/wiki/Barycentric_coordinate_system)
     * of the given point @p.
     *
     * The point @p must lie on the same plane as the triangle @t; if the
     * point is not coplanar, the result of this function is undefined.
     *
     * If we place the origin in the coordinates of the triangle's A point,
     * the barycentric coordinates are `u`, which is on the AC vector; and `v`
     * which is on the AB vector:
     *
     * ![](triangle-barycentric.png)
     *
     * The returned #graphene_vec2_t contains the following values, in order:
     *
     *  - `res.x = u`
     *  - `res.y = v`
     *
     * @param p a #graphene_point3d_t
     * @param res return location for the vector
     *   with the barycentric coordinates
     * @return `true` if the barycentric coordinates are valid
     * @since 1.2
     */
    public fun getBarycoords(
        p: Point3D? = null,
        res: Vec2,
    ): Boolean =
        graphene_triangle_get_barycoords(
            grapheneTrianglePointer.reinterpret(),
            p?.graphenePoint3DPointer,
            res.grapheneVec2Pointer
        )

    /**
     * Computes the bounding box of the given #graphene_triangle_t.
     *
     * @param res return location for the box
     * @since 1.2
     */
    public fun getBoundingBox(res: Box): Unit =
        graphene_triangle_get_bounding_box(grapheneTrianglePointer.reinterpret(), res.grapheneBoxPointer)

    /**
     * Computes the coordinates of the midpoint of the given #graphene_triangle_t.
     *
     * The midpoint G is the [centroid](https://en.wikipedia.org/wiki/Centroid#Triangle_centroid)
     * of the triangle, i.e. the intersection of its medians.
     *
     * @param res return location for the coordinates of
     *   the midpoint
     * @since 1.2
     */
    public fun getMidpoint(res: Point3D): Unit =
        graphene_triangle_get_midpoint(grapheneTrianglePointer.reinterpret(), res.graphenePoint3DPointer)

    /**
     * Computes the normal vector of the given #graphene_triangle_t.
     *
     * @param res return location for the normal vector
     * @since 1.2
     */
    public fun getNormal(res: Vec3): Unit =
        graphene_triangle_get_normal(grapheneTrianglePointer.reinterpret(), res.grapheneVec3Pointer)

    /**
     * Computes the plane based on the vertices of the given #graphene_triangle_t.
     *
     * @param res return location for the plane
     * @since 1.2
     */
    public fun getPlane(res: Plane): Unit =
        graphene_triangle_get_plane(grapheneTrianglePointer.reinterpret(), res.graphenePlanePointer)

    /**
     * Retrieves the three vertices of the given #graphene_triangle_t and returns
     * their coordinates as #graphene_point3d_t.
     *
     * @param a return location for the coordinates
     *   of the first vertex
     * @param b return location for the coordinates
     *   of the second vertex
     * @param c return location for the coordinates
     *   of the third vertex
     * @since 1.2
     */
    public fun getPoints(
        a: Point3D?,
        b: Point3D?,
        c: Point3D?,
    ): Unit =
        graphene_triangle_get_points(
            grapheneTrianglePointer.reinterpret(),
            a?.graphenePoint3DPointer,
            b?.graphenePoint3DPointer,
            c?.graphenePoint3DPointer
        )

    /**
     * Computes the UV coordinates of the given point @p.
     *
     * The point @p must lie on the same plane as the triangle @t; if the point
     * is not coplanar, the result of this function is undefined. If @p is null,
     * the point will be set in (0, 0, 0).
     *
     * The UV coordinates will be placed in the @res vector:
     *
     *  - `res.x = u`
     *  - `res.y = v`
     *
     * See also: graphene_triangle_get_barycoords()
     *
     * @param p a #graphene_point3d_t
     * @param uvA the UV coordinates of the first point
     * @param uvB the UV coordinates of the second point
     * @param uvC the UV coordinates of the third point
     * @param res a vector containing the UV coordinates
     *   of the given point @p
     * @return `true` if the coordinates are valid
     * @since 1.10
     */
    public fun getUv(
        p: Point3D? = null,
        uvA: Vec2,
        uvB: Vec2,
        uvC: Vec2,
        res: Vec2,
    ): Boolean =
        graphene_triangle_get_uv(
            grapheneTrianglePointer.reinterpret(),
            p?.graphenePoint3DPointer,
            uvA.grapheneVec2Pointer,
            uvB.grapheneVec2Pointer,
            uvC.grapheneVec2Pointer,
            res.grapheneVec2Pointer
        )

    /**
     * Retrieves the three vertices of the given #graphene_triangle_t.
     *
     * @param a return location for the first vertex
     * @param b return location for the second vertex
     * @param c return location for the third vertex
     * @since 1.2
     */
    public fun getVertices(
        a: Vec3?,
        b: Vec3?,
        c: Vec3?,
    ): Unit =
        graphene_triangle_get_vertices(
            grapheneTrianglePointer.reinterpret(),
            a?.grapheneVec3Pointer,
            b?.grapheneVec3Pointer,
            c?.grapheneVec3Pointer
        )

    /**
     * Initializes a #graphene_triangle_t using the three given 3D points.
     *
     * @param a a #graphene_point3d_t
     * @param b a #graphene_point3d_t
     * @param c a #graphene_point3d_t
     * @return the initialized #graphene_triangle_t
     * @since 1.2
     */
    public fun initFromPoint3d(
        a: Point3D? = null,
        b: Point3D? = null,
        c: Point3D? = null,
    ): Triangle =
        graphene_triangle_init_from_point3d(
            grapheneTrianglePointer.reinterpret(),
            a?.graphenePoint3DPointer,
            b?.graphenePoint3DPointer,
            c?.graphenePoint3DPointer
        )!!.run {
            Triangle(reinterpret())
        }

    /**
     * Initializes a #graphene_triangle_t using the three given vectors.
     *
     * @param a a #graphene_vec3_t
     * @param b a #graphene_vec3_t
     * @param c a #graphene_vec3_t
     * @return the initialized #graphene_triangle_t
     * @since 1.2
     */
    public fun initFromVec3(
        a: Vec3? = null,
        b: Vec3? = null,
        c: Vec3? = null,
    ): Triangle =
        graphene_triangle_init_from_vec3(
            grapheneTrianglePointer.reinterpret(),
            a?.grapheneVec3Pointer,
            b?.grapheneVec3Pointer,
            c?.grapheneVec3Pointer
        )!!.run {
            Triangle(reinterpret())
        }

    public companion object : RecordCompanion<Triangle, graphene_triangle_t> {
        /**
         * Allocates a new #graphene_triangle_t.
         *
         * The contents of the returned structure are undefined.
         *
         * @return the newly allocated #graphene_triangle_t
         *   structure. Use graphene_triangle_free() to free the resources
         *   allocated by this function
         * @since 1.2
         */
        public fun alloc(): Triangle = Triangle(graphene_triangle_alloc()!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Triangle = Triangle(pointer.reinterpret())
    }
}