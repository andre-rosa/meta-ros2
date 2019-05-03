# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Twist multiplexer, which multiplex several velocity commands (topics) and       allows to priorize or disable them (locks)."
AUTHOR = "Enrique Fernandez <efernandez@clearpathrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "CC-BY-NC-SA-4.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=6bc0e2b80b41b84c8240cea714dea709"

ROS_BPN = "twist_mux"

ROS_BUILD_DEPENDS = " \
    diagnostic-updater \
    geometry-msgs \
    roscpp \
    rostest \
    std-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-updater \
    geometry-msgs \
    roscpp \
    std-msgs \
    twist-mux-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-updater \
    geometry-msgs \
    roscpp \
    std-msgs \
    twist-mux-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rospy \
    rostopic \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/twist_mux-release/archive/release/melodic/twist_mux/3.1.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "440e8cd435fbaaa5c9ebc31265b244de"
SRC_URI[sha256sum] = "aa2888069d0ed77dbab6759a450cef52d03b6f64b09514c006bd2f49384732bd"
S = "${WORKDIR}/twist_mux-release-release-melodic-twist_mux-3.1.0-1"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('twist-mux', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/twist-mux/twist-mux_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/twist-mux/twist-mux-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/twist-mux/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/twist-mux/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
