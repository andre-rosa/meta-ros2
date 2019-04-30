# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosservice contains the rosservice command-line tool for listing     and querying ROS <a href="http://www.ros.org/wiki/Services">Services</a>. It also     contains a Python library for retrieving information about     Services and dynamically invoking them. The Python library is     experimental and is for internal-use only."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "http://ros.org/wiki/rosservice"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    genpy \
    rosgraph \
    roslib \
    rosmsg \
    rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    genpy \
    rosgraph \
    roslib \
    rosmsg \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/rosservice/1.14.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "73adf9b82462e5a9dd4b60cc5f017bef"
SRC_URI[sha256sum] = "3c702a38cbf823bf15ade07745f11dd6b19af38b936630dbadb3473aea130e36"
S = "${WORKDIR}/ros_comm-release-release-melodic-rosservice-1.14.3-0"

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
