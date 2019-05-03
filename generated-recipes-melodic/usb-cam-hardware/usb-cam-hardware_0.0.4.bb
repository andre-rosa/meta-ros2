# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The usb_cam_hardware package"
AUTHOR = "yoshito <yoshito@todo.todo>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "TODO"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_BPN = "usb_cam_hardware"

ROS_BUILD_DEPENDS = " \
    controller-manager \
    hardware-interface \
    nodelet \
    pluginlib \
    roscpp \
    usb-cam-hardware-interface \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    controller-manager \
    hardware-interface \
    nodelet \
    pluginlib \
    roscpp \
    usb-cam-hardware-interface \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-manager \
    hardware-interface \
    nodelet \
    pluginlib \
    roscpp \
    usb-cam-hardware-interface \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yoshito-n-students/usb_cam_hardware-release/archive/release/melodic/usb_cam_hardware/0.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e61800817d205f17ca45fd40c8e83a7f"
SRC_URI[sha256sum] = "29d9274d9b3cf8787c3f80c5354eb605608205118e6ccf56a2aabd26011f7b43"
S = "${WORKDIR}/usb_cam_hardware-release-release-melodic-usb_cam_hardware-0.0.4-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('usb-cam-hardware', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/usb-cam-hardware/usb-cam-hardware_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/usb-cam-hardware/usb-cam-hardware-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/usb-cam-hardware/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/usb-cam-hardware/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
