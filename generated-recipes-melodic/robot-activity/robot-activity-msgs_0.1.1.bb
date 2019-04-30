# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains messages used by robot_activity, such as node's state     and error"
AUTHOR = "Maciej ZURAD <maciej.zurad@gmail.com>"
HOMEPAGE = "http://www.ros.org/wiki/robot_activity_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    message-generation \
    message-runtime \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-generation \
    message-runtime \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-generation \
    message-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/snt-robotics/robot_activity-release/archive/release/melodic/robot_activity_msgs/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "11d885f8f9426cdd18b130fd9ac8f42a"
SRC_URI[sha256sum] = "c7047f132a865f58489413a1bb4e9c08ffe2014f3d404b4874f399eefeb9872e"
S = "${WORKDIR}/robot_activity-release-release-melodic-robot_activity_msgs-0.1.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/robot-activity/robot-activity_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/robot-activity/robot-activity_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-activity/robot-activity-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-activity/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-activity/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
