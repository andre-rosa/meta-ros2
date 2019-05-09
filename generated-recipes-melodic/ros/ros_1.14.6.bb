# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "ROS packaging system"
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Eric Berger"
HOMEPAGE = "http://www.ros.org/wiki/ROS"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros"
ROS_BPN = "ros"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    catkin \
    mk \
    rosbash \
    rosboost-cfg \
    rosbuild \
    rosclean \
    roscreate \
    roslang \
    roslib \
    rosmake \
    rosunit \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    catkin \
    mk \
    rosbash \
    rosboost-cfg \
    rosbuild \
    rosclean \
    roscreate \
    roslang \
    roslib \
    rosmake \
    rosunit \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/ros/1.14.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5f8dbe404feda46c6e4d4c0741df14af"
SRC_URI[sha256sum] = "f92a3cbe96dd8d490c60a52ff22ed01bb00d7c9a6e59a1bbfc7700d9b693d82e"
S = "${WORKDIR}/ros-release-release-melodic-ros-1.14.6-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('ros', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('ros', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros/ros_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros/ros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
