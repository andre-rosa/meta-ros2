# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Base implementation for CANopen chains node with support for management services and diagnostics"
AUTHOR = "Mathias Lüdtke <mathias.luedtke@ipa.fraunhofer.de>"
ROS_AUTHOR = "Mathias Lüdtke <mathias.luedtke@ipa.fraunhofer.de>"
HOMEPAGE = "http://wiki.ros.org/canopen_chain_node"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

ROS_CN = "ros_canopen"
ROS_BPN = "canopen_chain_node"

ROS_BUILD_DEPENDS = " \
    canopen-master \
    diagnostic-updater \
    message-generation \
    pluginlib \
    roscpp \
    roslib \
    socketcan-interface \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    canopen-master \
    diagnostic-updater \
    message-runtime \
    pluginlib \
    roscpp \
    roslib \
    socketcan-interface \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    canopen-master \
    diagnostic-updater \
    message-runtime \
    pluginlib \
    roscpp \
    roslib \
    socketcan-interface \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/canopen_chain_node/0.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "57c5d5b7681ef37443eb0615dc362c94"
SRC_URI[sha256sum] = "38578e51fcb8c8cf7e3de40d3febe7e318244f107b56346a984c7e5fe1cf9639"
S = "${WORKDIR}/ros_canopen-release-release-melodic-canopen_chain_node-0.8.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ros-canopen', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('ros-canopen', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-canopen/ros-canopen_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-canopen/ros-canopen-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-canopen/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-canopen/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
