# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "joint_trajectory_action_tools"
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Melonee Wise"
HOMEPAGE = "http://ros.org/wiki/joint_trajectory_action_tools"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_common_actions"
ROS_BPN = "joint_trajectory_action_tools"

ROS_BUILD_DEPENDS = " \
    joint-trajectory-action \
    pr2-controllers-msgs \
    roslib \
    rospy \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    joint-trajectory-action \
    pr2-controllers-msgs \
    roslib \
    rospy \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    joint-trajectory-action \
    pr2-controllers-msgs \
    roslib \
    rospy \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_common_actions-release/archive/release/melodic/joint_trajectory_action_tools/0.0.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "65ecb91117f30d09a78756cb00943913"
SRC_URI[sha256sum] = "cff217c086340f75d87f968fe96ab08c5485fb39779aa8d1af8699bcb993f356"
S = "${WORKDIR}/pr2_common_actions-release-release-melodic-joint_trajectory_action_tools-0.0.11-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('pr2-common-actions', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('pr2-common-actions', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-common-actions/pr2-common-actions_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-common-actions/pr2-common-actions-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-common-actions/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-common-actions/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
