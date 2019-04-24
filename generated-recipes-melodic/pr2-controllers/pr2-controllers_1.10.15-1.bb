# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Contains the controllers that run in realtime on the PR2 and supporting packages."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Stuart Glaser sglaser@willowgarage.com"
HOMEPAGE = "http://ros.org/wiki/pr2_controllers"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_controllers"
ROS_BPN = "pr2_controllers"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    control-toolbox \
    ethercat-trigger-controllers \
    joint-trajectory-action \
    pr2-calibration-controllers \
    pr2-controllers-msgs \
    pr2-gripper-action \
    pr2-head-action \
    pr2-mechanism-controllers \
    robot-mechanism-controllers \
    single-joint-position-action \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    control-toolbox \
    ethercat-trigger-controllers \
    joint-trajectory-action \
    pr2-calibration-controllers \
    pr2-controllers-msgs \
    pr2-gripper-action \
    pr2-head-action \
    pr2-mechanism-controllers \
    robot-mechanism-controllers \
    single-joint-position-action \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_controllers-release/archive/release/melodic/pr2_controllers/1.10.15-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c0f4d776985724cb68b9977faba31d6b"
SRC_URI[sha256sum] = "2d412c962cbfc58de7b38a1fc9c006e1598a72bb0457b124555ac973667e61d5"
S = "${WORKDIR}/pr2_controllers-release-release-melodic-pr2_controllers-1.10.15-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('pr2-controllers', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('pr2-controllers', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-controllers/pr2-controllers_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-controllers/pr2-controllers-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-controllers/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-controllers/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
