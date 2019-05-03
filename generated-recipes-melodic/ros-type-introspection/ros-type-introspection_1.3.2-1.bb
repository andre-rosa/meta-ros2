# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The ros_type_introspection package allows the user to parse and deserialize   ROS messages which type is unknown at compilation time."
AUTHOR = "Davide Faconti <faconti@icarustechnology.com>"
HOMEPAGE = "http://www.ros.org/wiki/ros_type_introspection"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "ros_type_introspection"

ROS_BUILD_DEPENDS = " \
    abseil-cpp \
    roscpp \
    roscpp-serialization \
    rostime \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    abseil-cpp \
    roscpp \
    roscpp-serialization \
    rostime \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    abseil-cpp \
    roscpp \
    roscpp-serialization \
    rostime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/facontidavide/ros_type_introspection-release/archive/release/melodic/ros_type_introspection/1.3.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9f5aa03dc0ca1bc5948ec7c8004089e0"
SRC_URI[sha256sum] = "df29da398149ab315bb922a74ef712841a546a8056554e3d9bc54ff0169e9eb3"
S = "${WORKDIR}/ros_type_introspection-release-release-melodic-ros_type_introspection-1.3.2-1"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('ros-type-introspection', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-type-introspection/ros-type-introspection_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-type-introspection/ros-type-introspection-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-type-introspection/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-type-introspection/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
