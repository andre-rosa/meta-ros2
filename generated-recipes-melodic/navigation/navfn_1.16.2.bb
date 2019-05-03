# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "navfn provides a fast interpolated navigation function that can be used to create plans for         a mobile base. The planner assumes a circular robot and operates on a costmap to find a         minimum cost plan from a start point to an end point in a grid. The navigation function is         computed with Dijkstra's algorithm, but support for an A* heuristic may also be added in the         near future. navfn also provides a ROS wrapper for the navfn planner that adheres to the         nav_core::BaseGlobalPlanner interface specified in <a href="http://wiki.ros.org/nav_core">nav_core</a>."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/navfn"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_BPN = "navfn"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    costmap-2d \
    geometry-msgs \
    message-generation \
    nav-core \
    nav-msgs \
    netpbm \
    pluginlib \
    rosconsole \
    roscpp \
    sensor-msgs \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    costmap-2d \
    geometry-msgs \
    nav-core \
    nav-msgs \
    pluginlib \
    rosconsole \
    roscpp \
    sensor-msgs \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    costmap-2d \
    geometry-msgs \
    message-runtime \
    nav-core \
    nav-msgs \
    pluginlib \
    rosconsole \
    roscpp \
    sensor-msgs \
    tf2-ros \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/melodic/navfn/1.16.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "aa7400fee80ad8508544806963a8ea6a"
SRC_URI[sha256sum] = "d4795ca8a10f1cb8d8ff7a2949637be11bb6e14ca0d2878731cdd82d20acb271"
S = "${WORKDIR}/navigation-release-release-melodic-navfn-1.16.2-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('navigation', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation/navigation_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation/navigation-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
