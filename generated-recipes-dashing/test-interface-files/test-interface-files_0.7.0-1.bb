# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "A package containing message definitions and fixtures used exclusively for testing purposes."
AUTHOR = "Karsten Knese <karsten@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "test_interface_files"
ROS_BPN = "test_interface_files"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-core-native \
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

SRC_URI = "https://github.com/ros2-gbp/test_interface_files-release/archive/release/dashing/test_interface_files/0.7.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "dc70c628c188a0a5a7557afe69f2720b"
SRC_URI[sha256sum] = "aada7f69102a89931e9c73e0ce5f9db22491b3f066de96e170eba134bbac97a3"
S = "${WORKDIR}/test_interface_files-release-release-dashing-test_interface_files-0.7.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('test-interface-files', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('test-interface-files', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/test-interface-files/test-interface-files_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/test-interface-files/test-interface-files-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/test-interface-files/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/test-interface-files/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
