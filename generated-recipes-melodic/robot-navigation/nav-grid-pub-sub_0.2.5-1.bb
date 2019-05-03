# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Publishers and Subscribers for nav_grid data."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "nav_grid_pub_sub"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    map-msgs \
    nav-2d-msgs \
    nav-2d-utils \
    nav-core2 \
    nav-grid \
    nav-grid-iterators \
    nav-msgs \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    map-msgs \
    nav-2d-msgs \
    nav-2d-utils \
    nav-core2 \
    nav-grid \
    nav-grid-iterators \
    nav-msgs \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    map-msgs \
    nav-2d-msgs \
    nav-2d-utils \
    nav-core2 \
    nav-grid \
    nav-grid-iterators \
    nav-msgs \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/nav_grid_pub_sub/0.2.5-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5afb60fbd5af2f8ba1bf1c360b7ecbe3"
SRC_URI[sha256sum] = "e2d1c5f03e225c1972d664a489216e5d37b8bf1284da2338b344637a44d48b39"
S = "${WORKDIR}/robot_navigation-release-release-melodic-nav_grid_pub_sub-0.2.5-1"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('robot-navigation', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-navigation/robot-navigation_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-navigation/robot-navigation-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-navigation/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-navigation/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
