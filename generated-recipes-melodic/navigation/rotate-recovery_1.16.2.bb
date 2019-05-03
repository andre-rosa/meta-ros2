# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This package provides a recovery behavior for the navigation stack that attempts to clear space by performing a 360 degree rotation of the robot."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/rotate_recovery"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_BPN = "rotate_recovery"

ROS_BUILD_DEPENDS = " \
    angles \
    base-local-planner \
    cmake-modules \
    costmap-2d \
    geometry-msgs \
    libeigen \
    nav-core \
    pluginlib \
    roscpp \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    costmap-2d \
    geometry-msgs \
    libeigen \
    nav-core \
    pluginlib \
    roscpp \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    costmap-2d \
    geometry-msgs \
    libeigen \
    nav-core \
    pluginlib \
    roscpp \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/melodic/rotate_recovery/1.16.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6a7212d0a81f00dc37b97a29743b7d7b"
SRC_URI[sha256sum] = "c16310caacd9352ba89b5eb4903bb43349ee2b781b77157a33df6cfa39bc6a07"
S = "${WORKDIR}/navigation-release-release-melodic-rotate_recovery-1.16.2-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('navigation', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation/navigation_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation/navigation-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
