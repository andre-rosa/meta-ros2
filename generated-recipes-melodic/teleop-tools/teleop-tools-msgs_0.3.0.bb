# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The teleop_tools_msgs package"
AUTHOR = "Bence Magyar <bence.magyar.robotics@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "teleop_tools_msgs"

ROS_BUILD_DEPENDS = " \
    actionlib-msgs \
    control-msgs \
    message-generation \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib-msgs \
    control-msgs \
    message-runtime \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib-msgs \
    control-msgs \
    message-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/teleop_tools-release/archive/release/melodic/teleop_tools_msgs/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "904798b8f19d593e04f4a7370e8a7b13"
SRC_URI[sha256sum] = "6a087baf64271603f7708582a440c2fe47f15f2da8be3996b115ad707ee05366"
S = "${WORKDIR}/teleop_tools-release-release-melodic-teleop_tools_msgs-0.3.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/teleop-tools/teleop-tools_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/teleop-tools/teleop-tools_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/teleop-tools/teleop-tools-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/teleop-tools/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/teleop-tools/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
