# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Instrumentation library for real-time performance testing"
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
ROS_AUTHOR = "Jackie Kay <jackie@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "realtime_support"
ROS_BPN = "rttest"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/realtime_support-release/archive/release/bouncy/rttest/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9e8e68db2e38e65c05b8c8ea80b4967f"
SRC_URI[sha256sum] = "41d6ed6b03234309699f43a26934fa36739b16465c1adf4d36ad339666e5c3b0"
S = "${WORKDIR}/realtime_support-release-release-bouncy-rttest-0.5.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('realtime-support', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('realtime-support', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/realtime-support/realtime-support_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/realtime-support/realtime-support-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/realtime-support/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/realtime-support/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
