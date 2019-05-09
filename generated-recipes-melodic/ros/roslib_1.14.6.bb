# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Base dependencies and support libraries for ROS.     roslib contains many of the common data structures and tools that are shared across ROS client library implementations."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Ken Conley <kwc@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/roslib"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros"
ROS_BPN = "roslib"

ROS_BUILD_DEPENDS = " \
    boost \
    rospack \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    catkin \
    ros-environment \
    rospack \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    catkin \
    ros-environment \
    rospack \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosmake \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/roslib/1.14.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1fdd5d7c9d74d2a97096dfce8e0d6764"
SRC_URI[sha256sum] = "e6a681f31b005d86d3d87877a69d398e5736ac4fc8cd3e65d8900d05b96f9b9b"
S = "${WORKDIR}/ros-release-release-melodic-roslib-1.14.6-0"

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
