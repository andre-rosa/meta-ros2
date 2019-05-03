# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Package for creating a hardware interface to the robot using the EtherCAT motor controller/driver"
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
HOMEPAGE = "http://ros.org/wiki/ethercat_hardware"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "ethercat_hardware"

ROS_BUILD_DEPENDS = " \
    diagnostic-msgs \
    diagnostic-updater \
    eml \
    libtinyxml \
    log4cxx \
    message-generation \
    pluginlib \
    pr2-hardware-interface \
    pr2-msgs \
    realtime-tools \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-msgs \
    diagnostic-updater \
    eml \
    libtinyxml \
    log4cxx \
    message-runtime \
    pluginlib \
    pr2-hardware-interface \
    pr2-msgs \
    realtime-tools \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    diagnostic-updater \
    eml \
    libtinyxml \
    log4cxx \
    message-runtime \
    pluginlib \
    pr2-hardware-interface \
    pr2-msgs \
    realtime-tools \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_ethercat_drivers-release/archive/release/melodic/ethercat_hardware/1.8.18-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "dc9a050f7423a2c65529b1eb42a3379a"
SRC_URI[sha256sum] = "43368d575a4d0b4f58a1e1896649012df83ba25fa63311ce42e26f5032d767f6"
S = "${WORKDIR}/pr2_ethercat_drivers-release-release-melodic-ethercat_hardware-1.8.18-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('pr2-ethercat-drivers', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-ethercat-drivers/pr2-ethercat-drivers_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-ethercat-drivers/pr2-ethercat-drivers-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-ethercat-drivers/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-ethercat-drivers/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
