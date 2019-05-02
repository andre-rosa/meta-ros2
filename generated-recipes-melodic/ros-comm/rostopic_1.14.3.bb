# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rostopic contains the rostopic command-line tool for displaying     debug information about     ROS <a href="http://www.ros.org/wiki/Topics">Topics</a>, including     publishers, subscribers, publishing rate,     and ROS <a href="http://www.ros.org/wiki/Messages">Messages</a>. It also     contains an experimental Python library for getting information about     and interacting with topics dynamically. This library is for     internal-use only as the code API may change, though it does provide     examples of how to implement dynamic subscription and publication     behaviors in ROS."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "http://ros.org/wiki/rostopic"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "rostopic"

ROS_BUILD_DEPENDS = " \
    rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    genpy \
    rosbag \
    rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    genpy \
    rosbag \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/rostopic/1.14.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "26df9d3073fd099eb473ef079a5ee3d0"
SRC_URI[sha256sum] = "0327ddd98b2b5aea960318ee4548726994d033f110d1016e53399a74ec6043de"
S = "${WORKDIR}/ros_comm-release-release-melodic-rostopic-1.14.3-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ros-comm/ros-comm_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ros-comm/ros-comm_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-comm/ros-comm-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-comm/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-comm/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
