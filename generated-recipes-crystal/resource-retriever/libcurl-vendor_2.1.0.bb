# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around libcurl, it provides a fixed CMake module and an ExternalProject build of it."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://github.com/curl/curl"
SECTION = "devel"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

ROS_BPN = "libcurl_vendor"

ROS_BUILD_DEPENDS = " \
    curl \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    curl \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    pkgconfig-native \
"

ROS_EXEC_DEPENDS = " \
    curl \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/resource_retriever-release/archive/release/crystal/libcurl_vendor/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9c9c03575834cd6007b490add29c2e4c"
SRC_URI[sha256sum] = "904b586704ed7f517291b7e7a863772b6cc3c2819fd2a2f1d9fce1f2d1b26708"
S = "${WORKDIR}/resource_retriever-release-release-crystal-libcurl_vendor-2.1.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/resource-retriever/resource-retriever_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/resource-retriever/resource-retriever_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/resource-retriever/resource-retriever-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/resource-retriever/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/resource-retriever/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
