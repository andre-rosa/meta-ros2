# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2_eigen"
AUTHOR = "Tully Foote <tfoote@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    libeigen \
    geometry-msgs \
    tf2 \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    libeigen \
    geometry-msgs \
    tf2 \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    tf2 \
    tf2-ros \
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

SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/bouncy/tf2_eigen/0.9.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "510acc500b00d9897310cb42f98dca8a"
SRC_URI[sha256sum] = "bdb944fa213578e9647fc45fdc4be5d735ab69f936128e686312f123a0c732cb"
S = "${WORKDIR}/geometry2-release-release-bouncy-tf2_eigen-0.9.1-1"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/geometry2/geometry2_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/geometry2/geometry2_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geometry2/geometry2-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geometry2/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geometry2/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
