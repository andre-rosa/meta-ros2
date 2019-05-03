# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This provides a ROS node for the PR2 Power Board."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
HOMEPAGE = "http://www.ros.org/wiki/pr2_power_board"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "pr2_power_board"

ROS_BUILD_DEPENDS = " \
    diagnostic-msgs \
    diagnostic-updater \
    log4cxx \
    message-generation \
    pr2-msgs \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-msgs \
    diagnostic-updater \
    log4cxx \
    message-runtime \
    pr2-msgs \
    roscpp \
    rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    diagnostic-updater \
    log4cxx \
    message-runtime \
    pr2-msgs \
    roscpp \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_power_drivers-release/archive/release/melodic/pr2_power_board/1.1.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7eaa9fce54c11075711d210108405f0c"
SRC_URI[sha256sum] = "9e6596dd8cdea88ca5abd93ecf2d567d34b89e97a4ffa32dbfdc8f001ce0cea9"
S = "${WORKDIR}/pr2_power_drivers-release-release-melodic-pr2_power_board-1.1.7-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('pr2-power-drivers', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-power-drivers/pr2-power-drivers_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-power-drivers/pr2-power-drivers-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-power-drivers/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-power-drivers/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
