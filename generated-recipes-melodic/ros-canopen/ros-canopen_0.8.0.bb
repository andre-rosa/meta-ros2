# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "A generic canopen implementation for ROS"
AUTHOR = "Mathias Lüdtke <mathias.luedtke@ipa.fraunhofer.de>"
ROS_AUTHOR = "Florian Weisshardt <fmw@ipa.fhg.de>"
HOMEPAGE = "http://ros.org/wiki/ros_canopen"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

ROS_CN = "ros_canopen"
ROS_BPN = "ros_canopen"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    can-msgs \
    canopen-402 \
    canopen-chain-node \
    canopen-master \
    canopen-motor-node \
    socketcan-bridge \
    socketcan-interface \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/ros_canopen/0.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ab9322e670f13d6b168a75ddf51a9d28"
SRC_URI[sha256sum] = "8a5c65352a4fdb30215c811264abe1e29d326afebac95bb06f50124bb78ca5f1"
S = "${WORKDIR}/ros_canopen-release-release-melodic-ros_canopen-0.8.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('ros-canopen', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('ros-canopen', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-canopen/ros-canopen_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-canopen/ros-canopen-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-canopen/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-canopen/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
