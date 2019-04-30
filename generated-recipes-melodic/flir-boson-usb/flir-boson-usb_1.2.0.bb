# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A simple USB camera driver for the FLIR BOSON using OpenCV"
AUTHOR = "AutonomouStuff Software Development Team <software@autonomoustuff.com>"
HOMEPAGE = "http://wiki.ros.org/flir_boson_usb"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_BUILD_DEPENDS = " \
    camera-info-manager \
    cv-bridge \
    image-transport \
    nodelet \
    roscpp \
    roslint \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    camera-info-manager \
    cv-bridge \
    image-transport \
    nodelet \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    camera-info-manager \
    cv-bridge \
    image-transport \
    nodelet \
    roscpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/astuff/flir_boson_usb-release/archive/release/melodic/flir_boson_usb/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ca0c7cb80e431d7bf1a1aa62853631bb"
SRC_URI[sha256sum] = "79c3e1f53669699fa6af61305dd25dfabddbf213bfa36df3b3419950dcf3568f"
S = "${WORKDIR}/flir_boson_usb-release-release-melodic-flir_boson_usb-1.2.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/flir-boson-usb/flir-boson-usb_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/flir-boson-usb/flir-boson-usb_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/flir-boson-usb/flir-boson-usb-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/flir-boson-usb/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/flir-boson-usb/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
