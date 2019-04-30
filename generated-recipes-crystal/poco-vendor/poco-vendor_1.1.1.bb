# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "CMake shim over the poco library."
AUTHOR = "Steven! Ragnarök <steven@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0 & Boost-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=401a7342a877608092ef332b6948eb03"

ROS_BPN = "poco_vendor"

ROS_BUILD_DEPENDS = " \
    libpcre \
    poco \
    zlib \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    libpcre \
    poco \
    zlib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    cmake-native \
"

ROS_EXEC_DEPENDS = " \
    libpcre \
    poco \
    zlib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/poco_vendor-release/archive/release/crystal/poco_vendor/1.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "328dcc3560d8525766af8f4b6b847597"
SRC_URI[sha256sum] = "81e48bbd06ea2658b572efa9e854fb233b6e02f7559ef0ab27ff7d93da0a8e1b"
S = "${WORKDIR}/poco_vendor-release-release-crystal-poco_vendor-1.1.1-0"

ROS_BUILD_TYPE = "cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/poco-vendor/poco-vendor_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/poco-vendor/poco-vendor_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/poco-vendor/poco-vendor-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/poco-vendor/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/poco-vendor/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
