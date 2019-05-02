# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package containes numerous examples of how to use SMACH. See the examples directory."
AUTHOR = "Devon Ash <dash@clearpathrobotics.com>"
HOMEPAGE = "http://ros.org/wiki/smach_tutorials"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "asmach_tutorials"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    asmach \
    message-generation \
    rospy \
    smach-ros \
    turtlesim \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    asmach \
    rospy \
    smach-ros \
    turtlesim \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    asmach \
    rospy \
    smach-ros \
    turtlesim \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/asmach_tutorials/1.0.13-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f7f4d9b0f1aa7787d3f2d6bb657742ab"
SRC_URI[sha256sum] = "ca0024ddfd9f62f4c76291300d9cf50e15fbc87e64af3823255db33e4285792e"
S = "${WORKDIR}/linux_networking-release-release-melodic-asmach_tutorials-1.0.13-2"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/linux-networking/linux-networking_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/linux-networking/linux-networking_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/linux-networking/linux-networking-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/linux-networking/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/linux-networking/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
