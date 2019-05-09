# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "ArbotiX Drivers"
AUTHOR = "Michael Ferguson <mike@vanadiumlabs.com>"
ROS_AUTHOR = "Michael Ferguson"
HOMEPAGE = "http://ros.org/wiki/arbotix"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "arbotix"
ROS_BPN = "arbotix"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    arbotix-controllers \
    arbotix-firmware \
    arbotix-msgs \
    arbotix-python \
    arbotix-sensors \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    arbotix-controllers \
    arbotix-firmware \
    arbotix-msgs \
    arbotix-python \
    arbotix-sensors \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/vanadiumlabs/arbotix_ros-release/archive/release/melodic/arbotix/0.10.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9daecf2ad28f9ba2693fb3242fef175e"
SRC_URI[sha256sum] = "3e72d718f9b9129b8537614cc5ae68e696b97def92315b859a5d2f00219f09e1"
S = "${WORKDIR}/arbotix_ros-release-release-melodic-arbotix-0.10.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('arbotix', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('arbotix', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/arbotix/arbotix_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/arbotix/arbotix-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/arbotix/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/arbotix/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
