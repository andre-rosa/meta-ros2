# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Command line tools for managing SROS2 keys"
AUTHOR = "Michael Carroll <michael@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

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
    python3-lxml \
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

SRC_URI = "https://github.com/ros2-gbp/sros2-release/archive/release/crystal/sros2/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "27030a4530d42ffd386622afe4a7b9b5"
SRC_URI[sha256sum] = "006a7b5eef7f2d33a38be6367659eec3a17a901a35339c1b30fd64b4ab2b4f76"
S = "${WORKDIR}/sros2-release-release-crystal-sros2-0.6.3-0"

ROS_BUILD_TYPE = "ament_python"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/sros2/sros2_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/sros2/sros2_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sros2/sros2-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sros2/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sros2/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
