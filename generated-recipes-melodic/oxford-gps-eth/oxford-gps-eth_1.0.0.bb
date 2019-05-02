# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Ethernet interface to OxTS GPS receivers (NCOM packet structure)"
AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
HOMEPAGE = "http://wiki.ros.org/oxford_gps_eth"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "oxford_gps_eth"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    gps-common \
    nav-msgs \
    roscpp \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    gps-common \
    nav-msgs \
    roscpp \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    gps-common \
    nav-msgs \
    roscpp \
    roslaunch \
    sensor-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/DataspeedInc-release/oxford_gps_eth-release/archive/release/melodic/oxford_gps_eth/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bbbd7d2c6ffb2cb571df6c4995ccdf94"
SRC_URI[sha256sum] = "e746691aeed3c6c6613c51e9be0db75d5c0d5c2442453823a466fa15cac9ee7e"
S = "${WORKDIR}/oxford_gps_eth-release-release-melodic-oxford_gps_eth-1.0.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/oxford-gps-eth/oxford-gps-eth_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/oxford-gps-eth/oxford-gps-eth_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/oxford-gps-eth/oxford-gps-eth-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/oxford-gps-eth/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/oxford-gps-eth/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
