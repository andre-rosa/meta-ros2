# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Facilities to monitor a network connection by sending UDP packets from     a client to a server, which bounces them back to the client. The client     collects statistics on latency and loss. The server is a C standalone utility     or a ROS node. The client can be a ROS node, a standalone utility or a python class."
AUTHOR = "Devon Ash <dash@clearpathrobotics.com>"
ROS_AUTHOR = "Blaise Gassend"
HOMEPAGE = "http://ros.org/wiki/network_monitor_udp"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "linux_networking"
ROS_BPN = "network_monitor_udp"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    diagnostic-msgs \
    message-generation \
    rospy \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    diagnostic-msgs \
    message-runtime \
    rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    diagnostic-msgs \
    message-runtime \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/network_monitor_udp/1.0.13-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "806af2d02853d4fc659bff79cd9f4d0e"
SRC_URI[sha256sum] = "d203956bc49ba42bf2f54ef0cb57253ec42fd8278260bd5090fd998765198154"
S = "${WORKDIR}/linux_networking-release-release-melodic-network_monitor_udp-1.0.13-2"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('linux-networking', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('linux-networking', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/linux-networking/linux-networking_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/linux-networking/linux-networking-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/linux-networking/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/linux-networking/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
