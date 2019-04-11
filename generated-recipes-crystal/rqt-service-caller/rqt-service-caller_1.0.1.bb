# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_service_caller provides a GUI plugin for calling arbitrary services."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "http://wiki.ros.org/rqt_service_caller"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXEC_DEPENDS = " \
    rqt-gui \
    rqt-gui-py \
    rqt-py-common \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rqt_service_caller-release/archive/release/crystal/rqt_service_caller/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "64c486ba9eebbbdd974d75c4ff8a874a"
SRC_URI[sha256sum] = "d8850f2897289e4414da4a2daf77e2f00e81c24e6753668e18c257b32ad53917"
S = "${WORKDIR}/rqt_service_caller-release-release-crystal-rqt_service_caller-1.0.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rqt-service-caller/rqt-service-caller_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rqt-service-caller/rqt-service-caller_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-service-caller/rqt-service-caller-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-service-caller/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-service-caller/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated_prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
