# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "CMake shim over the tinxml library."
AUTHOR = "Steven! Ragnarök <steven@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "tinyxml_vendor"
ROS_BPN = "tinyxml_vendor"

ROS_BUILD_DEPENDS = " \
    libtinyxml \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    libtinyxml \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libtinyxml \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/tinyxml_vendor-release/archive/release/bouncy/tinyxml_vendor/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7b0a4b3c128d0d1df1a83dec3f41e09b"
SRC_URI[sha256sum] = "3e061cc6b5630c477e5675633654ad70fb41076d5fb5bfa417f79975688a0372"
S = "${WORKDIR}/tinyxml_vendor-release-release-bouncy-tinyxml_vendor-0.5.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('tinyxml-vendor', d)}"
ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('tinyxml-vendor', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/tinyxml-vendor/tinyxml-vendor_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/tinyxml-vendor/tinyxml-vendor-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/tinyxml-vendor/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/tinyxml-vendor/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
