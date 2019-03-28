# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the C interfaces for eProsima FastRTPS."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    fastcdr-native \
    fastrtps-native \
    fastrtps-cmake-module-native \
    rosidl-cmake-native \
    rosidl-generator-c-native \
    rosidl-typesupport-fastrtps-cpp-native \
"

ROS_EXPORT_DEPENDS = " \
    rmw \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
    fastcdr-native \
    fastrtps-native \
    fastrtps-cmake-module-native \
    rosidl-cmake-native \
    rosidl-generator-c-native \
    rosidl-typesupport-fastrtps-cpp-native \
"

ROS_EXEC_DEPENDS = " \
    rosidl-parser \
    rosidl-typesupport-interface \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_fastrtps-release/archive/release/crystal/rosidl_typesupport_fastrtps_c/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "97318c780659b70ed547e3b9dfe5746f"
SRC_URI[sha256sum] = "7b6a807031603ef8dd4c18a8a78316fba8a333fca59e6ff65b6be32da4b5534a"
S = "${WORKDIR}/rosidl_typesupport_fastrtps-release-release-crystal-rosidl_typesupport_fastrtps_c-0.6.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rosidl-typesupport-fastrtps/rosidl-typesupport-fastrtps_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rosidl-typesupport-fastrtps/rosidl-typesupport-fastrtps_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosidl-typesupport-fastrtps/rosidl-typesupport-fastrtps-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosidl-typesupport-fastrtps/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosidl-typesupport-fastrtps/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
