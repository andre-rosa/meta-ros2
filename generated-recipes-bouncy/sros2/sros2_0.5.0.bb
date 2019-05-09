# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Command line tools for managing SROS2 keys"
AUTHOR = "Mikael Arguedas <mikael@osrfoundation.org>"
ROS_AUTHOR = "Morgan Quigley <morgan@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "sros2"
ROS_BPN = "sros2"

ROS_BUILD_DEPENDS = " \
    ros2cli \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    ros2cli \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    openssl \
    ros2cli \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/sros2-release/archive/release/bouncy/sros2/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f32494a8d70e72346e5a39d3bfbcd628"
SRC_URI[sha256sum] = "00a363fc039fa14fb0aa6ddce2ee8711eebbf6fb210dbac11b5c7d763911c151"
S = "${WORKDIR}/sros2-release-release-bouncy-sros2-0.5.0-0"

ROS_BUILD_TYPE = "ament_python"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('sros2', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('sros2', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sros2/sros2_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sros2/sros2-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sros2/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sros2/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
