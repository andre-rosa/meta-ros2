# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "CMake shim over the poco library."
AUTHOR = "Steven! Ragnarök <steven@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0 & Boost-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=401a7342a877608092ef332b6948eb03"

ROS_CN = "poco_vendor"
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

SRC_URI = "https://github.com/ros2-gbp/poco_vendor-release/archive/release/dashing/poco_vendor/1.2.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9561ff6bb7c46768531444787daa2bd8"
SRC_URI[sha256sum] = "ac61c044b172c2cd144fb22df5a466afefff5b980abfb5e245de67b24d867ed9"
S = "${WORKDIR}/poco_vendor-release-release-dashing-poco_vendor-1.2.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('poco-vendor', d)}"
ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('poco-vendor', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/poco-vendor/poco-vendor_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/poco-vendor/poco-vendor-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/poco-vendor/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/poco-vendor/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
