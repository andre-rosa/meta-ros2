# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Serial is a cross-platform, simple to use library for using serial ports on computers.  This library provides a C++, object oriented interface for interacting with RS-232 like devices on Linux and Windows."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "http://wjwwood.github.com/serial/"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_BPN = "serial"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    boost \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/wjwwood/serial-release/archive/release/melodic/serial/1.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1524caaf3c84b80e7855e5f5fa32ea47"
SRC_URI[sha256sum] = "2509a47393feef491a0876997beb0fd9af9ecc4e6ed6ceb533f3b8840471f1c2"
S = "${WORKDIR}/serial-release-release-melodic-serial-1.2.1-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('serial', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/serial/serial_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/serial/serial-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/serial/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/serial/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
