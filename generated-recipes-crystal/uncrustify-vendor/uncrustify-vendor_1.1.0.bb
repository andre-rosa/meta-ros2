# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around uncrustify, providing nothing but a dependency on uncrustify, on some systems.     On others, it provides an ExternalProject build of uncrustify."
AUTHOR = "Mikael Arguedas <mikael@osrfoundation.org>"
HOMEPAGE = "https://github.com/uncrustify/uncrustify"
SECTION = "devel"
LICENSE = "Apache-2.0 & GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

ROS_BPN = "uncrustify_vendor"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/uncrustify_vendor-release/archive/release/crystal/uncrustify_vendor/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9f4876a68076cd82e875c6408139f90d"
SRC_URI[sha256sum] = "e81702fda146eb9e430cb382a925c852d768aee7f801fe35df14c91cc2efbed5"
S = "${WORKDIR}/uncrustify_vendor-release-release-crystal-uncrustify_vendor-1.1.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/uncrustify-vendor/uncrustify-vendor_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/uncrustify-vendor/uncrustify-vendor_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/uncrustify-vendor/uncrustify-vendor-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/uncrustify-vendor/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/uncrustify-vendor/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
