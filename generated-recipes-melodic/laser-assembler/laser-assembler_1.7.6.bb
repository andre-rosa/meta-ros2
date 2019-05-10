# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Provides nodes to assemble point clouds from either LaserScan or PointCloud messages"
AUTHOR = "Jonathan Binney <jon.binney@gmail.com>"
ROS_AUTHOR = "Vijay Pradeep"
HOMEPAGE = "http://ros.org/wiki/laser_assembler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "laser_assembler"
ROS_BPN = "laser_assembler"

ROS_BUILD_DEPENDS = " \
    filters \
    laser-geometry \
    message-filters \
    message-generation \
    pluginlib \
    roscpp \
    rostest \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    filters \
    laser-geometry \
    message-filters \
    message-runtime \
    pluginlib \
    roscpp \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    filters \
    laser-geometry \
    message-filters \
    message-runtime \
    pluginlib \
    roscpp \
    sensor-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/laser_assembler-release/archive/release/melodic/laser_assembler/1.7.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2aa959221813993a53d4d017d86de83b"
SRC_URI[sha256sum] = "e9f578692846ccaf041da048fcfcef51d1a421a2869c94d2970541af319d3823"
S = "${WORKDIR}/laser_assembler-release-release-melodic-laser_assembler-1.7.6-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('laser-assembler', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('laser-assembler', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/laser-assembler/laser-assembler_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/laser-assembler/laser-assembler-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/laser-assembler/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/laser-assembler/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
