# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2 is the second generation of the transform library, which lets     the user keep track of multiple coordinate frames over time. tf2     maintains the relationship between coordinate frames in a tree     structure buffered in time, and lets the user transform points,     vectors, etc between any two coordinate frames at any desired     point in time."
AUTHOR = "Tully Foote <tfoote@osrfoundation.org>"
HOMEPAGE = "http://www.ros.org/wiki/tf2"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "tf2"

ROS_BUILD_DEPENDS = " \
    console-bridge \
    console-bridge-vendor \
    geometry-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    console-bridge \
    console-bridge-vendor \
    geometry-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    console-bridge \
    console-bridge-vendor \
    geometry-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/crystal/tf2/0.10.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5d5204abfeb70907cc14e02172052639"
SRC_URI[sha256sum] = "33f565f29e58c2675896a0b7dc88df83659a0acd09776f7aa40438ef7713b012"
S = "${WORKDIR}/geometry2-release-release-crystal-tf2-0.10.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/geometry2/geometry2_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/geometry2/geometry2_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geometry2/geometry2-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geometry2/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geometry2/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
