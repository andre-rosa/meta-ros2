# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ headers for URDF."
AUTHOR = "Steven! Ragnarök <steven@openrobotics.org>"
HOMEPAGE = "http://ros.org/wiki/urdf"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "urdfdom_headers"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/urdfdom_headers-release/archive/release/crystal/urdfdom_headers/1.0.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "25c60fc2b4c9d18021bc0cdebba8bfa5"
SRC_URI[sha256sum] = "57ca69ecd0c2de926bc758d5f7a32dce4cd2ebc7f902c69b22ee34f9647e62fa"
S = "${WORKDIR}/urdfdom_headers-release-release-crystal-urdfdom_headers-1.0.2-1"

ROS_BUILD_TYPE = "cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/urdfdom-headers/urdfdom-headers_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/urdfdom-headers/urdfdom-headers_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/urdfdom-headers/urdfdom-headers-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/urdfdom-headers/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/urdfdom-headers/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
