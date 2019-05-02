# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ROS node that allows control of network emulation parameters such as bandwidth, loss and latency for a Linux network interface."
AUTHOR = "Devon Ash <dash@clearpathrobotics.com>"
HOMEPAGE = "http://ros.org/wiki/network_traffic_control"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "network_traffic_control"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    rospy \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/network_traffic_control/1.0.13-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "11f7202bd71c62da1151b517f91e8428"
SRC_URI[sha256sum] = "a6ab6e3990f79606e3b67d8e1ee877c85a13469f3fcfc51faa321d79dfceafe1"
S = "${WORKDIR}/linux_networking-release-release-melodic-network_traffic_control-1.0.13-2"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/linux-networking/linux-networking_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/linux-networking/linux-networking_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/linux-networking/linux-networking-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/linux-networking/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/linux-networking/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
