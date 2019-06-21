# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Command line tools for managing SROS2 keys"
AUTHOR = "Michael Carroll <michael@openrobotics.org>"
ROS_AUTHOR = "Morgan Quigley <morgan@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "sros2"
ROS_BPN = "sros2"

ROS_BUILD_DEPENDS = " \
    rclpy \
    ros2cli \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    rclpy \
    ros2cli \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    openssl \
    python3-lxml \
    rclpy \
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

SRC_URI = "https://github.com/ros2-gbp/sros2-release/archive/release/dashing/sros2/0.7.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "cee4998d67cc3b26f92a3087a33b0373"
SRC_URI[sha256sum] = "e1f3418eb4f3500eb3c8603aab81c2315f248c1963efd4c808049b4778328612"
S = "${WORKDIR}/sros2-release-release-dashing-sros2-0.7.1-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('sros2', d)}"
ROS_BUILD_TYPE = "ament_python"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('sros2', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/sros2/sros2_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/sros2/sros2-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/sros2/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/sros2/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}