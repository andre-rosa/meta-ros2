# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Various actions which help in moving the arms of the PR2     or getting data from its tilting laser."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
HOMEPAGE = "http://wiki.ros.org/pr2_common_actions"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    joint-trajectory-action-tools \
    joint-trajectory-generator \
    pr2-arm-move-ik \
    pr2-common-action-msgs \
    pr2-tilt-laser-interface \
    pr2-tuck-arms-action \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    joint-trajectory-action-tools \
    joint-trajectory-generator \
    pr2-arm-move-ik \
    pr2-common-action-msgs \
    pr2-tilt-laser-interface \
    pr2-tuck-arms-action \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_common_actions-release/archive/release/melodic/pr2_common_actions/0.0.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "dd45523a63a57c5dd1fde765bd544f52"
SRC_URI[sha256sum] = "80fd608e81e3b4797e06188ddba9351c1cd1937e04985ff61c6c4d72e8a546ea"
S = "${WORKDIR}/pr2_common_actions-release-release-melodic-pr2_common_actions-0.0.11-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/pr2-common-actions/pr2-common-actions_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/pr2-common-actions/pr2-common-actions_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-common-actions/pr2-common-actions-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-common-actions/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-common-actions/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
