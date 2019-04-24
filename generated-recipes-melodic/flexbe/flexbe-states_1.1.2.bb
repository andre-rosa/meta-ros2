# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "flexbe_states provides a collection of predefined states.      Feel free to add new states."
AUTHOR = "Philipp Schillinger <schillin@kth.se>"
ROS_AUTHOR = "Philipp Schillinger"
HOMEPAGE = "http://ros.org/wiki/flexbe_states"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "flexbe"
ROS_BPN = "flexbe_states"

ROS_BUILD_DEPENDS = " \
    rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    flexbe-msgs \
    flexbe-testing \
    rosbag \
    rospy \
    smach-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    flexbe-msgs \
    flexbe-testing \
    rosbag \
    rospy \
    smach-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    geometry-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_states/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b39f69f740b900838ec7a6c4d00a59dd"
SRC_URI[sha256sum] = "bed0175b4a9722d2bd629c2098a0ca682adbbc576f81f93878a1851b841f085b"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_states-1.1.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('flexbe', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('flexbe', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/flexbe/flexbe_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/flexbe/flexbe-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/flexbe/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/flexbe/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
