# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "SainSmart USB relay driver controller"
AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
HOMEPAGE = "http://wiki.ros.org/sainsmart_relay_usb"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    libftdi-dev \
    roscpp \
    roslib \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    libftdi-dev \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libftdi-dev \
    roscpp \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/DataspeedInc-release/sainsmart_relay_usb-release/archive/release/melodic/sainsmart_relay_usb/0.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ba389b068f0c56dbe3322f13d3155757"
SRC_URI[sha256sum] = "73e7449cf27e9caa518695cb6996d8909422ae70540708e07580a666560ddd66"
S = "${WORKDIR}/sainsmart_relay_usb-release-release-melodic-sainsmart_relay_usb-0.0.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/sainsmart-relay-usb/sainsmart-relay-usb_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/sainsmart-relay-usb/sainsmart-relay-usb_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sainsmart-relay-usb/sainsmart-relay-usb-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sainsmart-relay-usb/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sainsmart-relay-usb/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
